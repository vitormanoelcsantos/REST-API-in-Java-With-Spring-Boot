package vmcs.rest_api.repository;

import org.springframework.data.repository.CrudRepository;
import vmcs.rest_api.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
