
/*
 * Label.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Label_H_
#define TINY_CPP_CLIENT_Label_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "NullableLabelStatus.h"
#include "NullableLabelType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Label{
public:

    /*! \brief Constructor.
	 */
    Label();
    Label(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Label();


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
	NullableLabelType getLabelType();

	/*! \brief Set 
	 */
	void setLabelType(NullableLabelType label_type);
	/*! \brief Get 
	 */
	NullableLabelStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(NullableLabelStatus status);
	/*! \brief Get Label name. 100-character limit.
	 */
	std::string getValue();

	/*! \brief Set Label name. 100-character limit.
	 */
	void setValue(std::string value);


    private:
    std::string id{};
    NullableLabelType label_type;
    NullableLabelStatus status;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_Label_H_ */
