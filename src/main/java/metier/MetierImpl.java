package metier;
import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    // @Autowired
    // @Autowired

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        return t * 23;
    }
    /*
    public void setDao(DaoImpl dao) {
        this.dao = dao;
    } */
}