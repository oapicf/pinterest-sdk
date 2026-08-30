
/*
 * LabelCreateItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LabelCreateItem_H_
#define TINY_CPP_CLIENT_LabelCreateItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LabelType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LabelCreateItem{
public:

    /*! \brief Constructor.
	 */
    LabelCreateItem();
    LabelCreateItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelCreateItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	LabelType getLabelType();

	/*! \brief Set 
	 */
	void setLabelType(LabelType label_type);
	/*! \brief Get Label name. 100-character limit.
	 */
	std::string getValue();

	/*! \brief Set Label name. 100-character limit.
	 */
	void setValue(std::string value);


    private:
    LabelType label_type;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_LabelCreateItem_H_ */
