#' Create a new ItemIdFilter
#'
#' @description
#' ItemIdFilter Class
#'
#' @docType class
#' @title ItemIdFilter
#' @description ItemIdFilter Class
#' @format An \code{R6Class} generator object
#' @field ITEM_ID  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemIdFilter <- R6::R6Class(
  "ItemIdFilter",
  public = list(
    `ITEM_ID` = NULL,

    #' @description
    #' Initialize a new ItemIdFilter class.
    #'
    #' @param ITEM_ID ITEM_ID
    #' @param ... Other optional arguments.
    initialize = function(`ITEM_ID`, ...) {
      if (!missing(`ITEM_ID`)) {
        stopifnot(R6::is.R6(`ITEM_ID`))
        self$`ITEM_ID` <- `ITEM_ID`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ItemIdFilter in JSON format
    toJSON = function() {
      ItemIdFilterObject <- list()
      if (!is.null(self$`ITEM_ID`)) {
        ItemIdFilterObject[["ITEM_ID"]] <-
          self$`ITEM_ID`$toJSON()
      }
      ItemIdFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemIdFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemIdFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ITEM_ID`)) {
        `item_id_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `item_id_object`$fromJSON(jsonlite::toJSON(this_object$`ITEM_ID`, auto_unbox = TRUE, digits = NA))
        self$`ITEM_ID` <- `item_id_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ItemIdFilter in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ITEM_ID`)) {
          sprintf(
          '"ITEM_ID":
          %s
          ',
          jsonlite::toJSON(self$`ITEM_ID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ItemIdFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemIdFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ITEM_ID` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`ITEM_ID`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ItemIdFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ITEM_ID`
      if (!is.null(input_json$`ITEM_ID`)) {
        stopifnot(R6::is.R6(input_json$`ITEM_ID`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemIdFilter: the required field `ITEM_ID` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemIdFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ITEM_ID` is null
      if (is.null(self$`ITEM_ID`)) {
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
      # check if the required `ITEM_ID` is null
      if (is.null(self$`ITEM_ID`)) {
        invalid_fields["ITEM_ID"] <- "Non-nullable required field `ITEM_ID` cannot be null."
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
# ItemIdFilter$unlock()
#
## Below is an example to define the print function
# ItemIdFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemIdFilter$lock()

