
/*
 * Paginated.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Paginated_H_
#define TINY_CPP_CLIENT_Paginated_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Paginated{
public:

    /*! \brief Constructor.
	 */
    Paginated();
    Paginated(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Paginated();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);
	/*! \brief Get 
	 */
	std::list<Object> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <Object> items);


    private:
    std::string bookmark{};
    std::list<Object> items;
};
}

#endif /* TINY_CPP_CLIENT_Paginated_H_ */
