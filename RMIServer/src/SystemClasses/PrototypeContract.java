package SystemClasses;

import java.io.Serializable;

/**
 *
 * @author Abdo
 */
public interface PrototypeContract extends Cloneable {
    public Contract cloneContract();
}
