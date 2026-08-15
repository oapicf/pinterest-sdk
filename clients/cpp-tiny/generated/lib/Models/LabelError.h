
/*
 * LabelError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LabelError_H_
#define TINY_CPP_CLIENT_LabelError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Label.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LabelError{
public:

    /*! \brief Constructor.
	 */
    LabelError();
    LabelError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LabelError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Label getData();

	/*! \brief Set 
	 */
	void setData(Label  data);
	/*! \brief Get 
	 */
	std::list<std::string> getErrorMessages();

	/*! \brief Set 
	 */
	void setErrorMessages(std::list <std::string> error_messages);


    private:
    Label data;
    std::list<std::string> error_messages;
};
}

#endif /* TINY_CPP_CLIENT_LabelError_H_ */
