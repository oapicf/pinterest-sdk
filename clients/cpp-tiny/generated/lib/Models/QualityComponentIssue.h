
/*
 * QualityComponentIssue.h
 *
 * Details of an issue with a quality component.
 */

#ifndef TINY_CPP_CLIENT_QualityComponentIssue_H_
#define TINY_CPP_CLIENT_QualityComponentIssue_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Details of an issue with a quality component.
 *
 *  \ingroup Models
 *
 */

class QualityComponentIssue{
public:

    /*! \brief Constructor.
	 */
    QualityComponentIssue();
    QualityComponentIssue(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QualityComponentIssue();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier for the issue check.
	 */
	std::string getId();

	/*! \brief Set Unique identifier for the issue check.
	 */
	void setId(std::string  id);
	/*! \brief Get Human-readable name of the issue.
	 */
	std::string getName();

	/*! \brief Set Human-readable name of the issue.
	 */
	void setName(std::string  name);
	/*! \brief Get Detailed reason for the issue.
	 */
	std::string getReason();

	/*! \brief Set Detailed reason for the issue.
	 */
	void setReason(std::string  reason);


    private:
    std::string id{};
    std::string name{};
    std::string reason{};
};
}

#endif /* TINY_CPP_CLIENT_QualityComponentIssue_H_ */
