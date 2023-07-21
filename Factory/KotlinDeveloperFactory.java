package Factory;

public class KotlinDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper(){
        return new KotlinDeveloper();
    }
}
