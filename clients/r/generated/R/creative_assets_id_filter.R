#' Create a new CreativeAssetsIdFilter
#'
#' @description
#' CreativeAssetsIdFilter Class
#'
#' @docType class
#' @title CreativeAssetsIdFilter
#' @description CreativeAssetsIdFilter Class
#' @format An \code{R6Class} generator object
#' @field CREATIVE_ASSETS_ID  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreativeAssetsIdFilter <- R6::R6Class(
  "CreativeAssetsIdFilter",
  public = list(
    `CREATIVE_ASSETS_ID` = NULL,

    #' @description
    #' Initialize a new CreativeAssetsIdFilter class.
    #'
    #' @param CREATIVE_ASSETS_ID CREATIVE_ASSETS_ID
    #' @param ... Other optional arguments.
    initialize = function(`CREATIVE_ASSETS_ID`, ...) {
      if (!missing(`CREATIVE_ASSETS_ID`)) {
        stopifnot(R6::is.R6(`CREATIVE_ASSETS_ID`))
        self$`CREATIVE_ASSETS_ID` <- `CREATIVE_ASSETS_ID`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreativeAssetsIdFilter in JSON format
    toJSON = function() {
      CreativeAssetsIdFilterObject <- list()
      if (!is.null(self$`CREATIVE_ASSETS_ID`)) {
        CreativeAssetsIdFilterObject[["CREATIVE_ASSETS_ID"]] <-
          self$`CREATIVE_ASSETS_ID`$toJSON()
      }
      CreativeAssetsIdFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreativeAssetsIdFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreativeAssetsIdFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`CREATIVE_ASSETS_ID`)) {
        `creative_assets_id_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `creative_assets_id_object`$fromJSON(jsonlite::toJSON(this_object$`CREATIVE_ASSETS_ID`, auto_unbox = TRUE, digits = NA))
        self$`CREATIVE_ASSETS_ID` <- `creative_assets_id_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreativeAssetsIdFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`CREATIVE_ASSETS_ID`)) {
          sprintf(
          '"CREATIVE_ASSETS_ID":
          %s
          ',
          jsonlite::toJSON(self$`CREATIVE_ASSETS_ID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreativeAssetsIdFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreativeAssetsIdFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`CREATIVE_ASSETS_ID` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`CREATIVE_ASSETS_ID`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreativeAssetsIdFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `CREATIVE_ASSETS_ID`
      if (!is.null(input_json$`CREATIVE_ASSETS_ID`)) {
        stopifnot(R6::is.R6(input_json$`CREATIVE_ASSETS_ID`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreativeAssetsIdFilter: the required field `CREATIVE_ASSETS_ID` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreativeAssetsIdFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `CREATIVE_ASSETS_ID` is null
      if (is.null(self$`CREATIVE_ASSETS_ID`)) {
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
      # check if the required `CREATIVE_ASSETS_ID` is null
      if (is.null(self$`CREATIVE_ASSETS_ID`)) {
        invalid_fields["CREATIVE_ASSETS_ID"] <- "Non-nullable required field `CREATIVE_ASSETS_ID` cannot be null."
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
# CreativeAssetsIdFilter$unlock()
#
## Below is an example to define the print function
# CreativeAssetsIdFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreativeAssetsIdFilter$lock()

