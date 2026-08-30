#' Create a new CatalogsHotelGuestRatings
#'
#' @description
#' CatalogsHotelGuestRatings Class
#'
#' @docType class
#' @title CatalogsHotelGuestRatings
#' @description CatalogsHotelGuestRatings Class
#' @format An \code{R6Class} generator object
#' @field max_score Max value for the hotel rating score. numeric [optional]
#' @field number_of_reviewers Total number of people who have rated this hotel. integer [optional]
#' @field rating_system System you use for guest reviews. character [optional]
#' @field score Your hotel's rating. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsHotelGuestRatings <- R6::R6Class(
  "CatalogsHotelGuestRatings",
  public = list(
    `max_score` = NULL,
    `number_of_reviewers` = NULL,
    `rating_system` = NULL,
    `score` = NULL,

    #' @description
    #' Initialize a new CatalogsHotelGuestRatings class.
    #'
    #' @param max_score Max value for the hotel rating score.
    #' @param number_of_reviewers Total number of people who have rated this hotel.
    #' @param rating_system System you use for guest reviews.
    #' @param score Your hotel's rating.
    #' @param ... Other optional arguments.
    initialize = function(`max_score` = NULL, `number_of_reviewers` = NULL, `rating_system` = NULL, `score` = NULL, ...) {
      if (!is.null(`max_score`)) {
        self$`max_score` <- `max_score`
      }
      if (!is.null(`number_of_reviewers`)) {
        if (!(is.numeric(`number_of_reviewers`) && length(`number_of_reviewers`) == 1)) {
          stop(paste("Error! Invalid data for `number_of_reviewers`. Must be an integer:", `number_of_reviewers`))
        }
        self$`number_of_reviewers` <- `number_of_reviewers`
      }
      if (!is.null(`rating_system`)) {
        if (!(is.character(`rating_system`) && length(`rating_system`) == 1)) {
          stop(paste("Error! Invalid data for `rating_system`. Must be a string:", `rating_system`))
        }
        self$`rating_system` <- `rating_system`
      }
      if (!is.null(`score`)) {
        self$`score` <- `score`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CatalogsHotelGuestRatings as a base R list.
    #' @examples
    #' # convert array of CatalogsHotelGuestRatings (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CatalogsHotelGuestRatings to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsHotelGuestRatingsObject <- list()
      if (!is.null(self$`max_score`)) {
        CatalogsHotelGuestRatingsObject[["max_score"]] <-
          self$`max_score`
      }
      if (!is.null(self$`number_of_reviewers`)) {
        CatalogsHotelGuestRatingsObject[["number_of_reviewers"]] <-
          self$`number_of_reviewers`
      }
      if (!is.null(self$`rating_system`)) {
        CatalogsHotelGuestRatingsObject[["rating_system"]] <-
          self$`rating_system`
      }
      if (!is.null(self$`score`)) {
        CatalogsHotelGuestRatingsObject[["score"]] <-
          self$`score`
      }
      return(CatalogsHotelGuestRatingsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelGuestRatings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelGuestRatings
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`max_score`)) {
        self$`max_score` <- this_object$`max_score`
      }
      if (!is.null(this_object$`number_of_reviewers`)) {
        self$`number_of_reviewers` <- this_object$`number_of_reviewers`
      }
      if (!is.null(this_object$`rating_system`)) {
        self$`rating_system` <- this_object$`rating_system`
      }
      if (!is.null(this_object$`score`)) {
        self$`score` <- this_object$`score`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsHotelGuestRatings in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsHotelGuestRatings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsHotelGuestRatings
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`max_score` <- this_object$`max_score`
      self$`number_of_reviewers` <- this_object$`number_of_reviewers`
      self$`rating_system` <- this_object$`rating_system`
      self$`score` <- this_object$`score`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsHotelGuestRatings and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsHotelGuestRatings
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsHotelGuestRatings$unlock()
#
## Below is an example to define the print function
# CatalogsHotelGuestRatings$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsHotelGuestRatings$lock()

