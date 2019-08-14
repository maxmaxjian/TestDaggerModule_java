import dagger.Component;

@Component( modules = Bar.class)
public interface BazComponent {
    Foo getBar();
}
