
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
#include "LabelStatus.h"
#include "LabelType.h"

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
	void setId(std::string  id);
	/*! \brief Get 
	 */
	LabelType getLabelType();

	/*! \brief Set 
	 */
	void setLabelType(LabelType  label_type);
	/*! \brief Get Label parent entity ID.
	 */
	std::string getParentId();

	/*! \brief Set Label parent entity ID.
	 */
	void setParentId(std::string  parent_id);
	/*! \brief Get Label parent entity type.
	 */
	std::string getParentType();

	/*! \brief Set Label parent entity type.
	 */
	void setParentType(std::string  parent_type);
	/*! \brief Get 
	 */
	LabelStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(LabelStatus  status);
	/*! \brief Get Label name.
	 */
	std::string getValue();

	/*! \brief Set Label name.
	 */
	void setValue(std::string  value);


    private:
    std::string id{};
    LabelType label_type;
    std::string parent_id{};
    std::string parent_type{};
    LabelStatus status;
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_Label_H_ */
