#' Create a new BrandAccountsCreateRequest
#'
#' @description
#' BrandAccountsCreateRequest Class
#'
#' @docType class
#' @title BrandAccountsCreateRequest
#' @description BrandAccountsCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field name Brand Account name character
#' @field username Brand Account username character
#' @field country  \link{Country}
#' @field about Brand Account about information character [optional]
#' @field website Brand Account website character [optional]
#' @field profile_image  \link{ImageBase64} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BrandAccountsCreateRequest <- R6::R6Class(
  "BrandAccountsCreateRequest",
  public = list(
    `name` = NULL,
    `username` = NULL,
    `country` = NULL,
    `about` = NULL,
    `website` = NULL,
    `profile_image` = NULL,

    #' @description
    #' Initialize a new BrandAccountsCreateRequest class.
    #'
    #' @param name Brand Account name
    #' @param username Brand Account username
    #' @param country country
    #' @param about Brand Account about information
    #' @param website Brand Account website
    #' @param profile_image profile_image
    #' @param ... Other optional arguments.
    initialize = function(`name`, `username`, `country`, `about` = NULL, `website` = NULL, `profile_image` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
      if (!missing(`country`)) {
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
    #' @return BrandAccountsCreateRequest as a base R list.
    #' @examples
    #' # convert array of BrandAccountsCreateRequest (x) to a data frame
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
    #' Convert BrandAccountsCreateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BrandAccountsCreateRequestObject <- list()
      if (!is.null(self$`name`)) {
        BrandAccountsCreateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`username`)) {
        BrandAccountsCreateRequestObject[["username"]] <-
          self$`username`
      }
      if (!is.null(self$`country`)) {
        BrandAccountsCreateRequestObject[["country"]] <-
          self$`country`$toSimpleType()
      }
      if (!is.null(self$`about`)) {
        BrandAccountsCreateRequestObject[["about"]] <-
          self$`about`
      }
      if (!is.null(self$`website`)) {
        BrandAccountsCreateRequestObject[["website"]] <-
          self$`website`
      }
      if (!is.null(self$`profile_image`)) {
        BrandAccountsCreateRequestObject[["profile_image"]] <-
          self$`profile_image`$toSimpleType()
      }
      return(BrandAccountsCreateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccountsCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccountsCreateRequest
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
    #' @return BrandAccountsCreateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccountsCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccountsCreateRequest
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
    #' Validate JSON input with respect to BrandAccountsCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BrandAccountsCreateRequest: the required field `name` is missing."))
      }
      # check the required field `username`
      if (!is.null(input_json$`username`)) {
        if (!(is.character(input_json$`username`) && length(input_json$`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", input_json$`username`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BrandAccountsCreateRequest: the required field `username` is missing."))
      }
      # check the required field `country`
      if (!is.null(input_json$`country`)) {
        stopifnot(R6::is.R6(input_json$`country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BrandAccountsCreateRequest: the required field `country` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BrandAccountsCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `username` is null
      if (is.null(self$`username`)) {
        return(FALSE)
      }

      # check if the required `country` is null
      if (is.null(self$`country`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `username` is null
      if (is.null(self$`username`)) {
        invalid_fields["username"] <- "Non-nullable required field `username` cannot be null."
      }

      # check if the required `country` is null
      if (is.null(self$`country`)) {
        invalid_fields["country"] <- "Non-nullable required field `country` cannot be null."
      }

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
# BrandAccountsCreateRequest$unlock()
#
## Below is an example to define the print function
# BrandAccountsCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BrandAccountsCreateRequest$lock()

