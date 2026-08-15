
/*
 * SingleInterestTargetingOptionResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SingleInterestTargetingOptionResponse_H_
#define TINY_CPP_CLIENT_SingleInterestTargetingOptionResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SingleInterestTargetingOptionResponse{
public:

    /*! \brief Constructor.
	 */
    SingleInterestTargetingOptionResponse();
    SingleInterestTargetingOptionResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SingleInterestTargetingOptionResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getChildInterests();

	/*! \brief Set 
	 */
	void setChildInterests(std::list <std::string> child_interests);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	int getLevel();

	/*! \brief Set 
	 */
	void setLevel(int  level);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);


    private:
    std::list<std::string> child_interests;
    std::string id{};
    int level{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_SingleInterestTargetingOptionResponse_H_ */
