
/*
 * CatalogsDbItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsDbItem_H_
#define TINY_CPP_CLIENT_CatalogsDbItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsDbItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsDbItem();
    CatalogsDbItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsDbItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string  created_at);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getUpdatedAt();

	/*! \brief Set 
	 */
	void setUpdatedAt(std::string  updated_at);


    private:
    std::string created_at{};
    std::string id{};
    std::string updated_at{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsDbItem_H_ */
