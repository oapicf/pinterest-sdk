#' Create a new AdsCreditRedeemRequest
#'
#' @description
#' AdsCreditRedeemRequest Class
#'
#' @docType class
#' @title AdsCreditRedeemRequest
#' @description AdsCreditRedeemRequest Class
#' @format An \code{R6Class} generator object
#' @field offerCodeHash Takes in a SHA256 hash of the offerCode. character
#' @field validateOnly If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsCreditRedeemRequest <- R6::R6Class(
  "AdsCreditRedeemRequest",
  public = list(
    `offerCodeHash` = NULL,
    `validateOnly` = NULL,
    #' Initialize a new AdsCreditRedeemRequest class.
    #'
    #' @description
    #' Initialize a new AdsCreditRedeemRequest class.
    #'
    #' @param offerCodeHash Takes in a SHA256 hash of the offerCode.
    #' @param validateOnly If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`offerCodeHash`, `validateOnly`, ...) {
      if (!missing(`offerCodeHash`)) {
        if (!(is.character(`offerCodeHash`) && length(`offerCodeHash`) == 1)) {
          stop(paste("Error! Invalid data for `offerCodeHash`. Must be a string:", `offerCodeHash`))
        }
        self$`offerCodeHash` <- `offerCodeHash`
      }
      if (!missing(`validateOnly`)) {
        if (!(is.logical(`validateOnly`) && length(`validateOnly`) == 1)) {
          stop(paste("Error! Invalid data for `validateOnly`. Must be a boolean:", `validateOnly`))
        }
        self$`validateOnly` <- `validateOnly`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsCreditRedeemRequest in JSON format
    #' @export
    toJSON = function() {
      AdsCreditRedeemRequestObject <- list()
      if (!is.null(self$`offerCodeHash`)) {
        AdsCreditRedeemRequestObject[["offerCodeHash"]] <-
          self$`offerCodeHash`
      }
      if (!is.null(self$`validateOnly`)) {
        AdsCreditRedeemRequestObject[["validateOnly"]] <-
          self$`validateOnly`
      }
      AdsCreditRedeemRequestObject
    },
    #' Deserialize JSON string into an instance of AdsCreditRedeemRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsCreditRedeemRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditRedeemRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`offerCodeHash`)) {
        self$`offerCodeHash` <- this_object$`offerCodeHash`
      }
      if (!is.null(this_object$`validateOnly`)) {
        self$`validateOnly` <- this_object$`validateOnly`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsCreditRedeemRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`offerCodeHash`)) {
          sprintf(
          '"offerCodeHash":
            "%s"
                    ',
          self$`offerCodeHash`
          )
        },
        if (!is.null(self$`validateOnly`)) {
          sprintf(
          '"validateOnly":
            %s
                    ',
          tolower(self$`validateOnly`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdsCreditRedeemRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsCreditRedeemRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsCreditRedeemRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`offerCodeHash` <- this_object$`offerCodeHash`
      self$`validateOnly` <- this_object$`validateOnly`
      self
    },
    #' Validate JSON input with respect to AdsCreditRedeemRequest
    #'
    #' @description
    #' Validate JSON input with respect to AdsCreditRedeemRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `offerCodeHash`
      if (!is.null(input_json$`offerCodeHash`)) {
        if (!(is.character(input_json$`offerCodeHash`) && length(input_json$`offerCodeHash`) == 1)) {
          stop(paste("Error! Invalid data for `offerCodeHash`. Must be a string:", input_json$`offerCodeHash`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsCreditRedeemRequest: the required field `offerCodeHash` is missing."))
      }
      # check the required field `validateOnly`
      if (!is.null(input_json$`validateOnly`)) {
        if (!(is.logical(input_json$`validateOnly`) && length(input_json$`validateOnly`) == 1)) {
          stop(paste("Error! Invalid data for `validateOnly`. Must be a boolean:", input_json$`validateOnly`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsCreditRedeemRequest: the required field `validateOnly` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsCreditRedeemRequest
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
      # check if the required `offerCodeHash` is null
      if (is.null(self$`offerCodeHash`)) {
        return(FALSE)
      }

      if (!str_detect(self$`offerCodeHash`, "^[a-z0-9]*$")) {
        return(FALSE)
      }

      # check if the required `validateOnly` is null
      if (is.null(self$`validateOnly`)) {
        return(FALSE)
      }

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
      # check if the required `offerCodeHash` is null
      if (is.null(self$`offerCodeHash`)) {
        invalid_fields["offerCodeHash"] <- "Non-nullable required field `offerCodeHash` cannot be null."
      }

      if (!str_detect(self$`offerCodeHash`, "^[a-z0-9]*$")) {
        invalid_fields["offerCodeHash"] <- "Invalid value for `offerCodeHash`, must conform to the pattern ^[a-z0-9]*$."
      }

      # check if the required `validateOnly` is null
      if (is.null(self$`validateOnly`)) {
        invalid_fields["validateOnly"] <- "Non-nullable required field `validateOnly` cannot be null."
      }

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
# AdsCreditRedeemRequest$unlock()
#
## Below is an example to define the print function
# AdsCreditRedeemRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsCreditRedeemRequest$lock()

