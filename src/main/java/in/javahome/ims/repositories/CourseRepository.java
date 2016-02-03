package in.javahome.ims.repositories;

import java.util.List;

import in.javahome.ims.entities.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
	public List<Course> findByCourseIdIn(List<Integer> courseIds);
}
