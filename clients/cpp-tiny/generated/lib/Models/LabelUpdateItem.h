
/*
 * LabelUpdateItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LabelUpdateItem_H_
#define TINY_CPP_CLIENT_LabelUpdateItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LabelStatus.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LabelUpdateItem{
public:

    /*! \brief Constructor.
	 */
    LabelUpdateItem();
    LabelUpdateItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelUpdateItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Label ID.
	 */
	std::string getId();

	/*! \brief Set Label ID.
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	LabelStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(LabelStatus status);
	/*! \brief Get Label name. 100-character limit.
	 */
	std::string getValue();

	/*! \brief Set Label name. 100-character limit.
	 */
	void setValue(std::string value);


    private:
    std::string id{};
    LabelStatus status;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_LabelUpdateItem_H_ */
