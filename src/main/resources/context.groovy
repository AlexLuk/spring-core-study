import groovy_example.Bread
import groovy_example.BreadImpl
import groovy_example.FakeBreadImpl

beans {
    myBean(FakeBreadImpl)
}