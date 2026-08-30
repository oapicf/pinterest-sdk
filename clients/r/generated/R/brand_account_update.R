#' Create a new BrandAccountUpdate
#'
#' @description
#' Resource create or update operation model.
#'
#' @docType class
#' @title BrandAccountUpdate
#' @description BrandAccountUpdate Class
#' @format An \code{R6Class} generator object
#' @field about Brand Account about information character [optional]
#' @field country  \link{Country} [optional]
#' @field name Brand Account name character [optional]
#' @field profile_image  \link{BrandAccountProfileImageUpdate} [optional]
#' @field username Brand Account username character [optional]
#' @field website Brand Account website character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BrandAccountUpdate <- R6::R6Class(
  "BrandAccountUpdate",
  public = list(
    `about` = NULL,
    `country` = NULL,
    `name` = NULL,
    `profile_image` = NULL,
    `username` = NULL,
    `website` = NULL,

    #' @description
    #' Initialize a new BrandAccountUpdate class.
    #'
    #' @param about Brand Account about information
    #' @param country country
    #' @param name Brand Account name
    #' @param profile_image profile_image
    #' @param username Brand Account username
    #' @param website Brand Account website
    #' @param ... Other optional arguments.
    initialize = function(`about` = NULL, `country` = NULL, `name` = NULL, `profile_image` = NULL, `username` = NULL, `website` = NULL, ...) {
      if (!is.null(`about`)) {
        if (!(is.character(`about`) && length(`about`) == 1)) {
          stop(paste("Error! Invalid data for `about`. Must be a string:", `about`))
        }
        self$`about` <- `about`
      }
      if (!is.null(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`profile_image`)) {
        stopifnot(R6::is.R6(`profile_image`))
        self$`profile_image` <- `profile_image`
      }
      if (!is.null(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
      if (!is.null(`website`)) {
        if (!(is.character(`website`) && length(`website`) == 1)) {
          stop(paste("Error! Invalid data for `website`. Must be a string:", `website`))
        }
        self$`website` <- `website`
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
    #' @return BrandAccountUpdate as a base R list.
    #' @examples
    #' # convert array of BrandAccountUpdate (x) to a data frame
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
    #' Convert BrandAccountUpdate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BrandAccountUpdateObject <- list()
      if (!is.null(self$`about`)) {
        BrandAccountUpdateObject[["about"]] <-
          self$`about`
      }
      if (!is.null(self$`country`)) {
        BrandAccountUpdateObject[["country"]] <-
          self$extractSimpleType(self$`country`)
      }
      if (!is.null(self$`name`)) {
        BrandAccountUpdateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`profile_image`)) {
        BrandAccountUpdateObject[["profile_image"]] <-
          self$extractSimpleType(self$`profile_image`)
      }
      if (!is.null(self$`username`)) {
        BrandAccountUpdateObject[["username"]] <-
          self$`username`
      }
      if (!is.null(self$`website`)) {
        BrandAccountUpdateObject[["website"]] <-
          self$`website`
      }
      return(BrandAccountUpdateObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccountUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccountUpdate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`about`)) {
        self$`about` <- this_object$`about`
      }
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`profile_image`)) {
        `profile_image_object` <- BrandAccountProfileImageUpdate$new()
        `profile_image_object`$fromJSON(jsonlite::toJSON(this_object$`profile_image`, auto_unbox = TRUE, digits = NA))
        self$`profile_image` <- `profile_image_object`
      }
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      if (!is.null(this_object$`website`)) {
        self$`website` <- this_object$`website`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BrandAccountUpdate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccountUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccountUpdate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`about` <- this_object$`about`
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`name` <- this_object$`name`
      self$`profile_image` <- BrandAccountProfileImageUpdate$new()$fromJSON(jsonlite::toJSON(this_object$`profile_image`, auto_unbox = TRUE, digits = NA))
      self$`username` <- this_object$`username`
      self$`website` <- this_object$`website`
      self
    },

    #' @description
    #' Validate JSON input with respect to BrandAccountUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BrandAccountUpdate
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
# BrandAccountUpdate$unlock()
#
## Below is an example to define the print function
# BrandAccountUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BrandAccountUpdate$lock()

