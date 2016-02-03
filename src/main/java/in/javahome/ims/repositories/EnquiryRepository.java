package in.javahome.ims.repositories;

import java.util.List;

import in.javahome.ims.entities.Course;
import in.javahome.ims.entities.Enquiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Integer>, JpaSpecificationExecutor<Enquiry>{
 public List<Enquiry> findByCourse(Course course);
}
