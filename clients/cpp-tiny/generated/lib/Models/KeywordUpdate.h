
/*
 * KeywordUpdate.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeywordUpdate_H_
#define TINY_CPP_CLIENT_KeywordUpdate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordUpdate{
public:

    /*! \brief Constructor.
	 */
    KeywordUpdate();
    KeywordUpdate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeywordUpdate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Is keyword archived?
	 */
	bool isArchived();

	/*! \brief Set Is keyword archived?
	 */
	void setArchived(bool  archived);
	/*! \brief Get </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	int getBid();

	/*! \brief Set </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	void setBid(int  bid);
	/*! \brief Get Keyword ID.
	 */
	std::string getId();

	/*! \brief Set Keyword ID.
	 */
	void setId(std::string  id);


    private:
    bool archived{};
    int bid{};
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_KeywordUpdate_H_ */
