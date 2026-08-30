
/*
 * EntityHistory.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EntityHistory_H_
#define TINY_CPP_CLIENT_EntityHistory_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChangeHistoryOperationType.h"
#include "EntityDataChangeHistory.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EntityHistory{
public:

    /*! \brief Constructor.
	 */
    EntityHistory();
    EntityHistory(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EntityHistory();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A Unix timestamp representing the time of the change in seconds
	 */
	int getChangeTimestamp();

	/*! \brief Set A Unix timestamp representing the time of the change in seconds
	 */
	void setChangeTimestamp(int change_timestamp);
	/*! \brief Get Properties associated with a particular change to an entity's data
	 */
	std::list<EntityDataChangeHistory> getDataChanges();

	/*! \brief Set Properties associated with a particular change to an entity's data
	 */
	void setDataChanges(std::list<EntityDataChangeHistory> data_changes);
	/*! \brief Get The id of the entity that was changed
	 */
	std::string getEntityId();

	/*! \brief Set The id of the entity that was changed
	 */
	void setEntityId(std::string entity_id);
	/*! \brief Get The name of the entity that was changed
	 */
	std::string getEntityName();

	/*! \brief Set The name of the entity that was changed
	 */
	void setEntityName(std::string entity_name);
	/*! \brief Get The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
	 */
	std::string getLdap();

	/*! \brief Set The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
	 */
	void setLdap(std::string ldap);
	/*! \brief Get The type of operation that caused the change
	 */
	ChangeHistoryOperationType getOperation();

	/*! \brief Set The type of operation that caused the change
	 */
	void setOperation(ChangeHistoryOperationType operation);
	/*! \brief Get The id of the user who initiated the change
	 */
	std::string getUserId();

	/*! \brief Set The id of the user who initiated the change
	 */
	void setUserId(std::string user_id);


    private:
    int change_timestamp{};
    std::list<EntityDataChangeHistory> data_changes;
    std::string entity_id{};
    std::string entity_name{};
    std::string ldap{};
    ChangeHistoryOperationType operation;
    std::string user_id{};
};
}

#endif /* TINY_CPP_CLIENT_EntityHistory_H_ */
