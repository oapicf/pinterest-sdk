#' Create a new ItemGroupIdFilter
#'
#' @description
#' ItemGroupIdFilter Class
#'
#' @docType class
#' @title ItemGroupIdFilter
#' @description ItemGroupIdFilter Class
#' @format An \code{R6Class} generator object
#' @field ITEM_GROUP_ID  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ItemGroupIdFilter <- R6::R6Class(
  "ItemGroupIdFilter",
  public = list(
    `ITEM_GROUP_ID` = NULL,
    #' Initialize a new ItemGroupIdFilter class.
    #'
    #' @description
    #' Initialize a new ItemGroupIdFilter class.
    #'
    #' @param ITEM_GROUP_ID ITEM_GROUP_ID
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ITEM_GROUP_ID`, ...) {
      if (!missing(`ITEM_GROUP_ID`)) {
        stopifnot(R6::is.R6(`ITEM_GROUP_ID`))
        self$`ITEM_GROUP_ID` <- `ITEM_GROUP_ID`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ItemGroupIdFilter in JSON format
    #' @export
    toJSON = function() {
      ItemGroupIdFilterObject <- list()
      if (!is.null(self$`ITEM_GROUP_ID`)) {
        ItemGroupIdFilterObject[["ITEM_GROUP_ID"]] <-
          self$`ITEM_GROUP_ID`$toJSON()
      }
      ItemGroupIdFilterObject
    },
    #' Deserialize JSON string into an instance of ItemGroupIdFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of ItemGroupIdFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemGroupIdFilter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ITEM_GROUP_ID`)) {
        `item_group_id_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `item_group_id_object`$fromJSON(jsonlite::toJSON(this_object$`ITEM_GROUP_ID`, auto_unbox = TRUE, digits = NA))
        self$`ITEM_GROUP_ID` <- `item_group_id_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ItemGroupIdFilter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ITEM_GROUP_ID`)) {
          sprintf(
          '"ITEM_GROUP_ID":
          %s
          ',
          jsonlite::toJSON(self$`ITEM_GROUP_ID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ItemGroupIdFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of ItemGroupIdFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ItemGroupIdFilter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ITEM_GROUP_ID` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`ITEM_GROUP_ID`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ItemGroupIdFilter
    #'
    #' @description
    #' Validate JSON input with respect to ItemGroupIdFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ITEM_GROUP_ID`
      if (!is.null(input_json$`ITEM_GROUP_ID`)) {
        stopifnot(R6::is.R6(input_json$`ITEM_GROUP_ID`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ItemGroupIdFilter: the required field `ITEM_GROUP_ID` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ItemGroupIdFilter
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
      # check if the required `ITEM_GROUP_ID` is null
      if (is.null(self$`ITEM_GROUP_ID`)) {
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
      # check if the required `ITEM_GROUP_ID` is null
      if (is.null(self$`ITEM_GROUP_ID`)) {
        invalid_fields["ITEM_GROUP_ID"] <- "Non-nullable required field `ITEM_GROUP_ID` cannot be null."
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
# ItemGroupIdFilter$unlock()
#
## Below is an example to define the print function
# ItemGroupIdFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ItemGroupIdFilter$lock()

