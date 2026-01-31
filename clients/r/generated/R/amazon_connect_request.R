#' Create a new AmazonConnectRequest
#'
#' @description
#' Request containing OTP and Amazon storefront info called by Amazon
#'
#' @docType class
#' @title AmazonConnectRequest
#' @description AmazonConnectRequest Class
#' @format An \code{R6Class} generator object
#' @field amazon_storefront_id The Amazon storefront id character [optional]
#' @field amazon_storefront_name The Amazon storefront name character
#' @field amazon_storefront_url The Amazon storefront url character
#' @field amazon_user_id The Amazon user id character [optional]
#' @field is_amazon_account_linked The Amazon account linking status character
#' @field one_time_passcode The one time passcode for Pinterest-initiated linking requests character [optional]
#' @field pinterest_user_id The Pinterest user id for Amazon-initiated linking requests character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AmazonConnectRequest <- R6::R6Class(
  "AmazonConnectRequest",
  public = list(
    `amazon_storefront_id` = NULL,
    `amazon_storefront_name` = NULL,
    `amazon_storefront_url` = NULL,
    `amazon_user_id` = NULL,
    `is_amazon_account_linked` = NULL,
    `one_time_passcode` = NULL,
    `pinterest_user_id` = NULL,

    #' @description
    #' Initialize a new AmazonConnectRequest class.
    #'
    #' @param amazon_storefront_name The Amazon storefront name
    #' @param amazon_storefront_url The Amazon storefront url
    #' @param is_amazon_account_linked The Amazon account linking status
    #' @param amazon_storefront_id The Amazon storefront id
    #' @param amazon_user_id The Amazon user id
    #' @param one_time_passcode The one time passcode for Pinterest-initiated linking requests
    #' @param pinterest_user_id The Pinterest user id for Amazon-initiated linking requests
    #' @param ... Other optional arguments.
    initialize = function(`amazon_storefront_name`, `amazon_storefront_url`, `is_amazon_account_linked`, `amazon_storefront_id` = NULL, `amazon_user_id` = NULL, `one_time_passcode` = NULL, `pinterest_user_id` = NULL, ...) {
      if (!missing(`amazon_storefront_name`)) {
        if (!(is.character(`amazon_storefront_name`) && length(`amazon_storefront_name`) == 1)) {
          stop(paste("Error! Invalid data for `amazon_storefront_name`. Must be a string:", `amazon_storefront_name`))
        }
        self$`amazon_storefront_name` <- `amazon_storefront_name`
      }
      if (!missing(`amazon_storefront_url`)) {
        if (!(is.character(`amazon_storefront_url`) && length(`amazon_storefront_url`) == 1)) {
          stop(paste("Error! Invalid data for `amazon_storefront_url`. Must be a string:", `amazon_storefront_url`))
        }
        self$`amazon_storefront_url` <- `amazon_storefront_url`
      }
      if (!missing(`is_amazon_account_linked`)) {
        if (!(is.logical(`is_amazon_account_linked`) && length(`is_amazon_account_linked`) == 1)) {
          stop(paste("Error! Invalid data for `is_amazon_account_linked`. Must be a boolean:", `is_amazon_account_linked`))
        }
        self$`is_amazon_account_linked` <- `is_amazon_account_linked`
      }
      if (!is.null(`amazon_storefront_id`)) {
        if (!(is.character(`amazon_storefront_id`) && length(`amazon_storefront_id`) == 1)) {
          stop(paste("Error! Invalid data for `amazon_storefront_id`. Must be a string:", `amazon_storefront_id`))
        }
        self$`amazon_storefront_id` <- `amazon_storefront_id`
      }
      if (!is.null(`amazon_user_id`)) {
        if (!(is.character(`amazon_user_id`) && length(`amazon_user_id`) == 1)) {
          stop(paste("Error! Invalid data for `amazon_user_id`. Must be a string:", `amazon_user_id`))
        }
        self$`amazon_user_id` <- `amazon_user_id`
      }
      if (!is.null(`one_time_passcode`)) {
        if (!(is.character(`one_time_passcode`) && length(`one_time_passcode`) == 1)) {
          stop(paste("Error! Invalid data for `one_time_passcode`. Must be a string:", `one_time_passcode`))
        }
        self$`one_time_passcode` <- `one_time_passcode`
      }
      if (!is.null(`pinterest_user_id`)) {
        if (!(is.character(`pinterest_user_id`) && length(`pinterest_user_id`) == 1)) {
          stop(paste("Error! Invalid data for `pinterest_user_id`. Must be a string:", `pinterest_user_id`))
        }
        self$`pinterest_user_id` <- `pinterest_user_id`
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
    #' @return AmazonConnectRequest as a base R list.
    #' @examples
    #' # convert array of AmazonConnectRequest (x) to a data frame
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
    #' Convert AmazonConnectRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AmazonConnectRequestObject <- list()
      if (!is.null(self$`amazon_storefront_id`)) {
        AmazonConnectRequestObject[["amazon_storefront_id"]] <-
          self$`amazon_storefront_id`
      }
      if (!is.null(self$`amazon_storefront_name`)) {
        AmazonConnectRequestObject[["amazon_storefront_name"]] <-
          self$`amazon_storefront_name`
      }
      if (!is.null(self$`amazon_storefront_url`)) {
        AmazonConnectRequestObject[["amazon_storefront_url"]] <-
          self$`amazon_storefront_url`
      }
      if (!is.null(self$`amazon_user_id`)) {
        AmazonConnectRequestObject[["amazon_user_id"]] <-
          self$`amazon_user_id`
      }
      if (!is.null(self$`is_amazon_account_linked`)) {
        AmazonConnectRequestObject[["is_amazon_account_linked"]] <-
          self$`is_amazon_account_linked`
      }
      if (!is.null(self$`one_time_passcode`)) {
        AmazonConnectRequestObject[["one_time_passcode"]] <-
          self$`one_time_passcode`
      }
      if (!is.null(self$`pinterest_user_id`)) {
        AmazonConnectRequestObject[["pinterest_user_id"]] <-
          self$`pinterest_user_id`
      }
      return(AmazonConnectRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AmazonConnectRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AmazonConnectRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`amazon_storefront_id`)) {
        self$`amazon_storefront_id` <- this_object$`amazon_storefront_id`
      }
      if (!is.null(this_object$`amazon_storefront_name`)) {
        self$`amazon_storefront_name` <- this_object$`amazon_storefront_name`
      }
      if (!is.null(this_object$`amazon_storefront_url`)) {
        self$`amazon_storefront_url` <- this_object$`amazon_storefront_url`
      }
      if (!is.null(this_object$`amazon_user_id`)) {
        self$`amazon_user_id` <- this_object$`amazon_user_id`
      }
      if (!is.null(this_object$`is_amazon_account_linked`)) {
        self$`is_amazon_account_linked` <- this_object$`is_amazon_account_linked`
      }
      if (!is.null(this_object$`one_time_passcode`)) {
        self$`one_time_passcode` <- this_object$`one_time_passcode`
      }
      if (!is.null(this_object$`pinterest_user_id`)) {
        self$`pinterest_user_id` <- this_object$`pinterest_user_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AmazonConnectRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AmazonConnectRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AmazonConnectRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`amazon_storefront_id` <- this_object$`amazon_storefront_id`
      self$`amazon_storefront_name` <- this_object$`amazon_storefront_name`
      self$`amazon_storefront_url` <- this_object$`amazon_storefront_url`
      self$`amazon_user_id` <- this_object$`amazon_user_id`
      self$`is_amazon_account_linked` <- this_object$`is_amazon_account_linked`
      self$`one_time_passcode` <- this_object$`one_time_passcode`
      self$`pinterest_user_id` <- this_object$`pinterest_user_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to AmazonConnectRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `amazon_storefront_name`
      if (!is.null(input_json$`amazon_storefront_name`)) {
        if (!(is.character(input_json$`amazon_storefront_name`) && length(input_json$`amazon_storefront_name`) == 1)) {
          stop(paste("Error! Invalid data for `amazon_storefront_name`. Must be a string:", input_json$`amazon_storefront_name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AmazonConnectRequest: the required field `amazon_storefront_name` is missing."))
      }
      # check the required field `amazon_storefront_url`
      if (!is.null(input_json$`amazon_storefront_url`)) {
        if (!(is.character(input_json$`amazon_storefront_url`) && length(input_json$`amazon_storefront_url`) == 1)) {
          stop(paste("Error! Invalid data for `amazon_storefront_url`. Must be a string:", input_json$`amazon_storefront_url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AmazonConnectRequest: the required field `amazon_storefront_url` is missing."))
      }
      # check the required field `is_amazon_account_linked`
      if (!is.null(input_json$`is_amazon_account_linked`)) {
        if (!(is.logical(input_json$`is_amazon_account_linked`) && length(input_json$`is_amazon_account_linked`) == 1)) {
          stop(paste("Error! Invalid data for `is_amazon_account_linked`. Must be a boolean:", input_json$`is_amazon_account_linked`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AmazonConnectRequest: the required field `is_amazon_account_linked` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AmazonConnectRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `amazon_storefront_name` is null
      if (is.null(self$`amazon_storefront_name`)) {
        return(FALSE)
      }

      # check if the required `amazon_storefront_url` is null
      if (is.null(self$`amazon_storefront_url`)) {
        return(FALSE)
      }

      # check if the required `is_amazon_account_linked` is null
      if (is.null(self$`is_amazon_account_linked`)) {
        return(FALSE)
      }

      if (!str_detect(self$`pinterest_user_id`, "^\\d+$")) {
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
      # check if the required `amazon_storefront_name` is null
      if (is.null(self$`amazon_storefront_name`)) {
        invalid_fields["amazon_storefront_name"] <- "Non-nullable required field `amazon_storefront_name` cannot be null."
      }

      # check if the required `amazon_storefront_url` is null
      if (is.null(self$`amazon_storefront_url`)) {
        invalid_fields["amazon_storefront_url"] <- "Non-nullable required field `amazon_storefront_url` cannot be null."
      }

      # check if the required `is_amazon_account_linked` is null
      if (is.null(self$`is_amazon_account_linked`)) {
        invalid_fields["is_amazon_account_linked"] <- "Non-nullable required field `is_amazon_account_linked` cannot be null."
      }

      if (!str_detect(self$`pinterest_user_id`, "^\\d+$")) {
        invalid_fields["pinterest_user_id"] <- "Invalid value for `pinterest_user_id`, must conform to the pattern ^\\d+$."
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
# AmazonConnectRequest$unlock()
#
## Below is an example to define the print function
# AmazonConnectRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AmazonConnectRequest$lock()

