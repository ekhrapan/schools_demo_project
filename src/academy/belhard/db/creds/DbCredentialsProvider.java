package academy.belhard.db.creds;

public interface DbCredentialsProvider {

    String getUrl();

    String getUser();

    String getPassword();
}
