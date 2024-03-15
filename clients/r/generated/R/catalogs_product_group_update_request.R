#' Create a new CatalogsProductGroupUpdateRequest
#'
#' @description
#' Request object for updating a product group.
#'
#' @docType class
#' @title CatalogsProductGroupUpdateRequest
#' @description CatalogsProductGroupUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field name  character [optional]
#' @field description  character [optional]
#' @field is_featured boolean indicator of whether the product group is being featured or not character [optional]
#' @field filters  \link{CatalogsProductGroupFiltersRequest} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupUpdateRequest <- R6::R6Class(
  "CatalogsProductGroupUpdateRequest",
  public = list(
    `name` = NULL,
    `description` = NULL,
    `is_featured` = NULL,
    `filters` = NULL,
    #' Initialize a new CatalogsProductGroupUpdateRequest class.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroupUpdateRequest class.
    #'
    #' @param name name
    #' @param description description
    #' @param is_featured boolean indicator of whether the product group is being featured or not
    #' @param filters filters
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name` = NULL, `description` = NULL, `is_featured` = NULL, `filters` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`is_featured`)) {
        if (!(is.logical(`is_featured`) && length(`is_featured`) == 1)) {
          stop(paste("Error! Invalid data for `is_featured`. Must be a boolean:", `is_featured`))
        }
        self$`is_featured` <- `is_featured`
      }
      if (!is.null(`filters`)) {
        stopifnot(R6::is.R6(`filters`))
        self$`filters` <- `filters`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupUpdateRequest in JSON format
    #' @export
    toJSON = function() {
      CatalogsProductGroupUpdateRequestObject <- list()
      if (!is.null(self$`name`)) {
        CatalogsProductGroupUpdateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        CatalogsProductGroupUpdateRequestObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`is_featured`)) {
        CatalogsProductGroupUpdateRequestObject[["is_featured"]] <-
          self$`is_featured`
      }
      if (!is.null(self$`filters`)) {
        CatalogsProductGroupUpdateRequestObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      CatalogsProductGroupUpdateRequestObject
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupUpdateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupUpdateRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`is_featured`)) {
        self$`is_featured` <- this_object$`is_featured`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsProductGroupFiltersRequest$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupUpdateRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`is_featured`)) {
          sprintf(
          '"is_featured":
            %s
                    ',
          tolower(self$`is_featured`)
          )
        },
        if (!is.null(self$`filters`)) {
          sprintf(
          '"filters":
          %s
          ',
          jsonlite::toJSON(self$`filters`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupUpdateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupUpdateRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`is_featured` <- this_object$`is_featured`
      self$`filters` <- CatalogsProductGroupFiltersRequest$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsProductGroupUpdateRequest
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupUpdateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupUpdateRequest
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsProductGroupUpdateRequest$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupUpdateRequest$lock()

