#' Create a new BrandAccountsUpdateRequest
#'
#' @description
#' BrandAccountsUpdateRequest Class
#'
#' @docType class
#' @title BrandAccountsUpdateRequest
#' @description BrandAccountsUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field name Brand Account name character [optional]
#' @field username Brand Account username character [optional]
#' @field country  \link{Country} [optional]
#' @field about Brand Account about information character [optional]
#' @field website Brand Account website character [optional]
#' @field profile_image  \link{ImageBase64} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BrandAccountsUpdateRequest <- R6::R6Class(
  "BrandAccountsUpdateRequest",
  public = list(
    `name` = NULL,
    `username` = NULL,
    `country` = NULL,
    `about` = NULL,
    `website` = NULL,
    `profile_image` = NULL,

    #' @description
    #' Initialize a new BrandAccountsUpdateRequest class.
    #'
    #' @param name Brand Account name
    #' @param username Brand Account username
    #' @param country country
    #' @param about Brand Account about information
    #' @param website Brand Account website
    #' @param profile_image profile_image
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `username` = NULL, `country` = NULL, `about` = NULL, `website` = NULL, `profile_image` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
      if (!is.null(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!is.null(`about`)) {
        if (!(is.character(`about`) && length(`about`) == 1)) {
          stop(paste("Error! Invalid data for `about`. Must be a string:", `about`))
        }
        self$`about` <- `about`
      }
      if (!is.null(`website`)) {
        if (!(is.character(`website`) && length(`website`) == 1)) {
          stop(paste("Error! Invalid data for `website`. Must be a string:", `website`))
        }
        self$`website` <- `website`
      }
      if (!is.null(`profile_image`)) {
        stopifnot(R6::is.R6(`profile_image`))
        self$`profile_image` <- `profile_image`
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
    #' @return BrandAccountsUpdateRequest as a base R list.
    #' @examples
    #' # convert array of BrandAccountsUpdateRequest (x) to a data frame
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
    #' Convert BrandAccountsUpdateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BrandAccountsUpdateRequestObject <- list()
      if (!is.null(self$`name`)) {
        BrandAccountsUpdateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`username`)) {
        BrandAccountsUpdateRequestObject[["username"]] <-
          self$`username`
      }
      if (!is.null(self$`country`)) {
        BrandAccountsUpdateRequestObject[["country"]] <-
          self$`country`$toSimpleType()
      }
      if (!is.null(self$`about`)) {
        BrandAccountsUpdateRequestObject[["about"]] <-
          self$`about`
      }
      if (!is.null(self$`website`)) {
        BrandAccountsUpdateRequestObject[["website"]] <-
          self$`website`
      }
      if (!is.null(self$`profile_image`)) {
        BrandAccountsUpdateRequestObject[["profile_image"]] <-
          self$`profile_image`$toSimpleType()
      }
      return(BrandAccountsUpdateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccountsUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccountsUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`about`)) {
        self$`about` <- this_object$`about`
      }
      if (!is.null(this_object$`website`)) {
        self$`website` <- this_object$`website`
      }
      if (!is.null(this_object$`profile_image`)) {
        `profile_image_object` <- ImageBase64$new()
        `profile_image_object`$fromJSON(jsonlite::toJSON(this_object$`profile_image`, auto_unbox = TRUE, digits = NA))
        self$`profile_image` <- `profile_image_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BrandAccountsUpdateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccountsUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccountsUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`username` <- this_object$`username`
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`about` <- this_object$`about`
      self$`website` <- this_object$`website`
      self$`profile_image` <- ImageBase64$new()$fromJSON(jsonlite::toJSON(this_object$`profile_image`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to BrandAccountsUpdateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BrandAccountsUpdateRequest
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
# BrandAccountsUpdateRequest$unlock()
#
## Below is an example to define the print function
# BrandAccountsUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BrandAccountsUpdateRequest$lock()

