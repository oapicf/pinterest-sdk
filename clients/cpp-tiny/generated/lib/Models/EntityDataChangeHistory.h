
/*
 * EntityDataChangeHistory.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EntityDataChangeHistory_H_
#define TINY_CPP_CLIENT_EntityDataChangeHistory_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChangeHistoryDataType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EntityDataChangeHistory{
public:

    /*! \brief Constructor.
	 */
    EntityDataChangeHistory();
    EntityDataChangeHistory(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EntityDataChangeHistory();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A string identifier representing the changed field on the entity
	 */
	std::string getChangedFieldId();

	/*! \brief Set A string identifier representing the changed field on the entity
	 */
	void setChangedFieldId(std::string changed_field_id);
	/*! \brief Get The human readable name of the changed field on the entity
	 */
	std::string getChangedFieldName();

	/*! \brief Set The human readable name of the changed field on the entity
	 */
	void setChangedFieldName(std::string changed_field_name);
	/*! \brief Get Specifies the type of the field's data values
	 */
	ChangeHistoryDataType getDataType();

	/*! \brief Set Specifies the type of the field's data values
	 */
	void setDataType(ChangeHistoryDataType data_type);
	/*! \brief Get A string representation of the value of the changed field, after the change
	 */
	std::string getNewDataValue();

	/*! \brief Set A string representation of the value of the changed field, after the change
	 */
	void setNewDataValue(std::string new_data_value);
	/*! \brief Get A string representation of the value of the changed field, before the change
	 */
	std::string getOldDataValue();

	/*! \brief Set A string representation of the value of the changed field, before the change
	 */
	void setOldDataValue(std::string old_data_value);


    private:
    std::string changed_field_id{};
    std::string changed_field_name{};
    ChangeHistoryDataType data_type;
    std::string new_data_value{};
    std::string old_data_value{};
};
}

#endif /* TINY_CPP_CLIENT_EntityDataChangeHistory_H_ */
