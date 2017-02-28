import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();
		String sha1 = DigestUtils.sha1Hex(uuid);
		log.info("UUID {} SHA-1 {}", uuid, sha1);
	}

}
