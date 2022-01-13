/**
 * 
 */
package com.tutorial.spring;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 *JPA using Spring's JPA Repository
 *
 */
interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
