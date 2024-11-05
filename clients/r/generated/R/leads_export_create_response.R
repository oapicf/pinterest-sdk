#' Create a new LeadsExportCreateResponse
#'
#' @description
#' LeadsExportCreateResponse Class
#'
#' @docType class
#' @title LeadsExportCreateResponse
#' @description LeadsExportCreateResponse Class
#' @format An \code{R6Class} generator object
#' @field leads_export_id ID for the leads export job character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadsExportCreateResponse <- R6::R6Class(
  "LeadsExportCreateResponse",
  public = list(
    `leads_export_id` = NULL,

    #' @description
    #' Initialize a new LeadsExportCreateResponse class.
    #'
    #' @param leads_export_id ID for the leads export job
    #' @param ... Other optional arguments.
    initialize = function(`leads_export_id` = NULL, ...) {
      if (!is.null(`leads_export_id`)) {
        if (!(is.character(`leads_export_id`) && length(`leads_export_id`) == 1)) {
          stop(paste("Error! Invalid data for `leads_export_id`. Must be a string:", `leads_export_id`))
        }
        self$`leads_export_id` <- `leads_export_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadsExportCreateResponse in JSON format
    toJSON = function() {
      LeadsExportCreateResponseObject <- list()
      if (!is.null(self$`leads_export_id`)) {
        LeadsExportCreateResponseObject[["leads_export_id"]] <-
          self$`leads_export_id`
      }
      LeadsExportCreateResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadsExportCreateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadsExportCreateResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`leads_export_id`)) {
        self$`leads_export_id` <- this_object$`leads_export_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return LeadsExportCreateResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`leads_export_id`)) {
          sprintf(
          '"leads_export_id":
            "%s"
                    ',
          self$`leads_export_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadsExportCreateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadsExportCreateResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`leads_export_id` <- this_object$`leads_export_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadsExportCreateResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadsExportCreateResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`leads_export_id`, "^\\d+$")) {
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
      if (!str_detect(self$`leads_export_id`, "^\\d+$")) {
        invalid_fields["leads_export_id"] <- "Invalid value for `leads_export_id`, must conform to the pattern ^\\d+$."
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
# LeadsExportCreateResponse$unlock()
#
## Below is an example to define the print function
# LeadsExportCreateResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadsExportCreateResponse$lock()

