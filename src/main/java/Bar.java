import dagger.Module;
import dagger.Provides;

@Module
public class Bar {

    private static Bar instance;

    private String name;

    public Bar(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Provides
    public static Bar provideBar() {
        if (instance == null) {
            instance = new Bar("bar");
        }
        return instance;
    }

    @Override
    public String toString() {
        return name;
    }
}
