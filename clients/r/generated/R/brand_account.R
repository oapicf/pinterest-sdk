#' Create a new BrandAccount
#'
#' @description
#' BrandAccount Class
#'
#' @docType class
#' @title BrandAccount
#' @description BrandAccount Class
#' @format An \code{R6Class} generator object
#' @field brand_account_id  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BrandAccount <- R6::R6Class(
  "BrandAccount",
  public = list(
    `brand_account_id` = NULL,

    #' @description
    #' Initialize a new BrandAccount class.
    #'
    #' @param brand_account_id brand_account_id
    #' @param ... Other optional arguments.
    initialize = function(`brand_account_id`, ...) {
      if (!missing(`brand_account_id`)) {
        if (!(is.character(`brand_account_id`) && length(`brand_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `brand_account_id`. Must be a string:", `brand_account_id`))
        }
        self$`brand_account_id` <- `brand_account_id`
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
    #' @return BrandAccount as a base R list.
    #' @examples
    #' # convert array of BrandAccount (x) to a data frame
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
    #' Convert BrandAccount to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BrandAccountObject <- list()
      if (!is.null(self$`brand_account_id`)) {
        BrandAccountObject[["brand_account_id"]] <-
          self$`brand_account_id`
      }
      return(BrandAccountObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccount
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccount
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`brand_account_id`)) {
        self$`brand_account_id` <- this_object$`brand_account_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BrandAccount in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BrandAccount
    #'
    #' @param input_json the JSON input
    #' @return the instance of BrandAccount
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`brand_account_id` <- this_object$`brand_account_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to BrandAccount and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `brand_account_id`
      if (!is.null(input_json$`brand_account_id`)) {
        if (!(is.character(input_json$`brand_account_id`) && length(input_json$`brand_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `brand_account_id`. Must be a string:", input_json$`brand_account_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BrandAccount: the required field `brand_account_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BrandAccount
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `brand_account_id` is null
      if (is.null(self$`brand_account_id`)) {
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
      # check if the required `brand_account_id` is null
      if (is.null(self$`brand_account_id`)) {
        invalid_fields["brand_account_id"] <- "Non-nullable required field `brand_account_id` cannot be null."
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
# BrandAccount$unlock()
#
## Below is an example to define the print function
# BrandAccount$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BrandAccount$lock()

