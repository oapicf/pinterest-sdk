
/*
 * KeywordUpdateItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeywordUpdateItem_H_
#define TINY_CPP_CLIENT_KeywordUpdateItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordUpdateItem{
public:

    /*! \brief Constructor.
	 */
    KeywordUpdateItem();
    KeywordUpdateItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordUpdateItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isArchived();

	/*! \brief Set 
	 */
	void setArchived(bool archived);
	/*! \brief Get **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	int getBid();

	/*! \brief Set **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	void setBid(int bid);
	/*! \brief Get Keyword ID .
	 */
	std::string getId();

	/*! \brief Set Keyword ID .
	 */
	void setId(std::string id);


    private:
    bool archived{};
    int bid{};
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_KeywordUpdateItem_H_ */
