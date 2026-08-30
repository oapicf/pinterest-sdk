
/*
 * RecordCounts.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RecordCounts_H_
#define TINY_CPP_CLIENT_RecordCounts_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RecordCounts{
public:

    /*! \brief Constructor.
	 */
    RecordCounts();
    RecordCounts(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RecordCounts();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Number of invalid records processed
	 */
	int getInvalid();

	/*! \brief Set Number of invalid records processed
	 */
	void setInvalid(int invalid);
	/*! \brief Get Number of records processed
	 */
	int getProcessed();

	/*! \brief Set Number of records processed
	 */
	void setProcessed(int processed);
	/*! \brief Get Number of valid records processed
	 */
	int getValid();

	/*! \brief Set Number of valid records processed
	 */
	void setValid(int valid);


    private:
    int invalid{};
    int processed{};
    int valid{};
};
}

#endif /* TINY_CPP_CLIENT_RecordCounts_H_ */
