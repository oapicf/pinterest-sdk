
/*
 * Interest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Interest_H_
#define TINY_CPP_CLIENT_Interest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Interest{
public:

    /*! \brief Constructor.
	 */
    Interest();
    Interest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Interest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getCanonicalUrl();

	/*! \brief Set 
	 */
	void setCanonicalUrl(std::string  canonical_url);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getKey();

	/*! \brief Set 
	 */
	void setKey(std::string  key);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);


    private:
    std::string canonical_url{};
    std::string id{};
    std::string key{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_Interest_H_ */
