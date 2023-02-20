package nyu.storeadmin.edu.utility;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.security.SecureRandom;
import java.util.Random;

@Component
public class SecurityUtility {
    private static final String SALT = "salt";

    @Bean
    public static BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
    }

    @Bean
    public static String randomPassword() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        while(salt.length() < 18) {
            int index = (int)(rnd.nextFloat()*SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public static void addImage(MultipartFile productImage, Long id){

        try {
            byte[] bytes = productImage.getBytes();
            String name = id + ".png";
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File("src/main/resources/static/image/product/" + name)));
            stream.write(bytes);
            BufferedOutputStream stream1 = new BufferedOutputStream(new FileOutputStream(new File("target/classes/static/image/product/" + name)));
            stream1.write(bytes);
            BufferedOutputStream stream2 = new BufferedOutputStream(new FileOutputStream(new File("../nyubookstore/src/main/resources/static/productimage/" + name)));
            stream2.write(bytes);
            BufferedOutputStream stream3 = new BufferedOutputStream(new FileOutputStream(new File("../nyubookstore/target/classes/static/productimage/" + name)));
            stream3.write(bytes);
            stream.close();
            stream1.close();
            stream2.close();
            stream3.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
