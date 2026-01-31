#' Create a new CarouselSlot
#'
#' @description
#' CarouselSlot Class
#'
#' @docType class
#' @title CarouselSlot
#' @description CarouselSlot Class
#' @format An \code{R6Class} generator object
#' @field description Carousel Pin slot description. character [optional]
#' @field link Carousel Pin slot link. character [optional]
#' @field title Carousel Pin slot title. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CarouselSlot <- R6::R6Class(
  "CarouselSlot",
  public = list(
    `description` = NULL,
    `link` = NULL,
    `title` = NULL,

    #' @description
    #' Initialize a new CarouselSlot class.
    #'
    #' @param description Carousel Pin slot description.
    #' @param link Carousel Pin slot link.
    #' @param title Carousel Pin slot title.
    #' @param ... Other optional arguments.
    initialize = function(`description` = NULL, `link` = NULL, `title` = NULL, ...) {
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`link`)) {
        if (!(is.character(`link`) && length(`link`) == 1)) {
          stop(paste("Error! Invalid data for `link`. Must be a string:", `link`))
        }
        self$`link` <- `link`
      }
      if (!is.null(`title`)) {
        if (!(is.character(`title`) && length(`title`) == 1)) {
          stop(paste("Error! Invalid data for `title`. Must be a string:", `title`))
        }
        self$`title` <- `title`
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
    #' @return CarouselSlot as a base R list.
    #' @examples
    #' # convert array of CarouselSlot (x) to a data frame
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
    #' Convert CarouselSlot to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CarouselSlotObject <- list()
      if (!is.null(self$`description`)) {
        CarouselSlotObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`link`)) {
        CarouselSlotObject[["link"]] <-
          self$`link`
      }
      if (!is.null(self$`title`)) {
        CarouselSlotObject[["title"]] <-
          self$`title`
      }
      return(CarouselSlotObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CarouselSlot
    #'
    #' @param input_json the JSON input
    #' @return the instance of CarouselSlot
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`link`)) {
        self$`link` <- this_object$`link`
      }
      if (!is.null(this_object$`title`)) {
        self$`title` <- this_object$`title`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CarouselSlot in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CarouselSlot
    #'
    #' @param input_json the JSON input
    #' @return the instance of CarouselSlot
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`link` <- this_object$`link`
      self$`title` <- this_object$`title`
      self
    },

    #' @description
    #' Validate JSON input with respect to CarouselSlot and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CarouselSlot
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
# CarouselSlot$unlock()
#
## Below is an example to define the print function
# CarouselSlot$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CarouselSlot$lock()

