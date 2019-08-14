import dagger.Module;
import dagger.Provides;

@Module
public class BarModule {
    private static Bar bar;

    public BarModule() {}

    @Provides
    public static Bar provideBar() {
        if (bar == null) {
            bar = Bar.provideBar();
        }
        return bar;
    }
}
