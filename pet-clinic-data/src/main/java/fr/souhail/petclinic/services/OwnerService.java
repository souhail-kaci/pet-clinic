package fr.souhail.petclinic.services;

import fr.souhail.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
