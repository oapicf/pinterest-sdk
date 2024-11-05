#' Create a new BidFloor
#'
#' @description
#' BidFloor Class
#'
#' @docType class
#' @title BidFloor
#' @description BidFloor Class
#' @format An \code{R6Class} generator object
#' @field bid_floors A list of bid floors in micro currency. For example, [100000, 200000] list(integer) [optional]
#' @field type Always the string 'bidfloor' character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BidFloor <- R6::R6Class(
  "BidFloor",
  public = list(
    `bid_floors` = NULL,
    `type` = NULL,

    #' @description
    #' Initialize a new BidFloor class.
    #'
    #' @param bid_floors A list of bid floors in micro currency. For example, [100000, 200000]
    #' @param type Always the string 'bidfloor'. Default to "bidfloor".
    #' @param ... Other optional arguments.
    initialize = function(`bid_floors` = NULL, `type` = "bidfloor", ...) {
      if (!is.null(`bid_floors`)) {
        stopifnot(is.vector(`bid_floors`), length(`bid_floors`) != 0)
        sapply(`bid_floors`, function(x) stopifnot(is.character(x)))
        self$`bid_floors` <- `bid_floors`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return BidFloor in JSON format
    toJSON = function() {
      BidFloorObject <- list()
      if (!is.null(self$`bid_floors`)) {
        BidFloorObject[["bid_floors"]] <-
          self$`bid_floors`
      }
      if (!is.null(self$`type`)) {
        BidFloorObject[["type"]] <-
          self$`type`
      }
      BidFloorObject
    },

    #' @description
    #' Deserialize JSON string into an instance of BidFloor
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidFloor
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`bid_floors`)) {
        self$`bid_floors` <- ApiClient$new()$deserializeObj(this_object$`bid_floors`, "array[integer]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return BidFloor in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`bid_floors`)) {
          sprintf(
          '"bid_floors":
             [%s]
          ',
          paste(unlist(lapply(self$`bid_floors`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of BidFloor
    #'
    #' @param input_json the JSON input
    #' @return the instance of BidFloor
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`bid_floors` <- ApiClient$new()$deserializeObj(this_object$`bid_floors`, "array[integer]", loadNamespace("openapi"))
      self$`type` <- this_object$`type`
      self
    },

    #' @description
    #' Validate JSON input with respect to BidFloor and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BidFloor
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
# BidFloor$unlock()
#
## Below is an example to define the print function
# BidFloor$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BidFloor$lock()

