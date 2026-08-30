#' Create a new CustomerListUploadCreateResponse
#'
#' @description
#' CustomerListUploadCreateResponse Class
#'
#' @docType class
#' @title CustomerListUploadCreateResponse
#' @description CustomerListUploadCreateResponse Class
#' @format An \code{R6Class} generator object
#' @field customer_list_upload The Customer List Upload created. \link{CustomerListUpload}
#' @field s3_multipart_upload_data Pre-signed upload URLs corresponding to each part of the upload. \link{S3MultipartUploadData}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerListUploadCreateResponse <- R6::R6Class(
  "CustomerListUploadCreateResponse",
  public = list(
    `customer_list_upload` = NULL,
    `s3_multipart_upload_data` = NULL,

    #' @description
    #' Initialize a new CustomerListUploadCreateResponse class.
    #'
    #' @param customer_list_upload The Customer List Upload created.
    #' @param s3_multipart_upload_data Pre-signed upload URLs corresponding to each part of the upload.
    #' @param ... Other optional arguments.
    initialize = function(`customer_list_upload`, `s3_multipart_upload_data`, ...) {
      if (!missing(`customer_list_upload`)) {
        stopifnot(R6::is.R6(`customer_list_upload`))
        self$`customer_list_upload` <- `customer_list_upload`
      }
      if (!missing(`s3_multipart_upload_data`)) {
        stopifnot(R6::is.R6(`s3_multipart_upload_data`))
        self$`s3_multipart_upload_data` <- `s3_multipart_upload_data`
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
    #' @return CustomerListUploadCreateResponse as a base R list.
    #' @examples
    #' # convert array of CustomerListUploadCreateResponse (x) to a data frame
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
    #' Convert CustomerListUploadCreateResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomerListUploadCreateResponseObject <- list()
      if (!is.null(self$`customer_list_upload`)) {
        CustomerListUploadCreateResponseObject[["customer_list_upload"]] <-
          self$extractSimpleType(self$`customer_list_upload`)
      }
      if (!is.null(self$`s3_multipart_upload_data`)) {
        CustomerListUploadCreateResponseObject[["s3_multipart_upload_data"]] <-
          self$extractSimpleType(self$`s3_multipart_upload_data`)
      }
      return(CustomerListUploadCreateResponseObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListUploadCreateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListUploadCreateResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`customer_list_upload`)) {
        `customer_list_upload_object` <- CustomerListUpload$new()
        `customer_list_upload_object`$fromJSON(jsonlite::toJSON(this_object$`customer_list_upload`, auto_unbox = TRUE, digits = NA))
        self$`customer_list_upload` <- `customer_list_upload_object`
      }
      if (!is.null(this_object$`s3_multipart_upload_data`)) {
        `s3_multipart_upload_data_object` <- S3MultipartUploadData$new()
        `s3_multipart_upload_data_object`$fromJSON(jsonlite::toJSON(this_object$`s3_multipart_upload_data`, auto_unbox = TRUE, digits = NA))
        self$`s3_multipart_upload_data` <- `s3_multipart_upload_data_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomerListUploadCreateResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerListUploadCreateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerListUploadCreateResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`customer_list_upload` <- CustomerListUpload$new()$fromJSON(jsonlite::toJSON(this_object$`customer_list_upload`, auto_unbox = TRUE, digits = NA))
      self$`s3_multipart_upload_data` <- S3MultipartUploadData$new()$fromJSON(jsonlite::toJSON(this_object$`s3_multipart_upload_data`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerListUploadCreateResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `customer_list_upload`
      if (!is.null(input_json$`customer_list_upload`)) {
        stopifnot(R6::is.R6(input_json$`customer_list_upload`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUploadCreateResponse: the required field `customer_list_upload` is missing."))
      }
      # check the required field `s3_multipart_upload_data`
      if (!is.null(input_json$`s3_multipart_upload_data`)) {
        stopifnot(R6::is.R6(input_json$`s3_multipart_upload_data`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerListUploadCreateResponse: the required field `s3_multipart_upload_data` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerListUploadCreateResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `customer_list_upload` is null
      if (is.null(self$`customer_list_upload`)) {
        return(FALSE)
      }

      # check if the required `s3_multipart_upload_data` is null
      if (is.null(self$`s3_multipart_upload_data`)) {
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
      # check if the required `customer_list_upload` is null
      if (is.null(self$`customer_list_upload`)) {
        invalid_fields["customer_list_upload"] <- "Non-nullable required field `customer_list_upload` cannot be null."
      }

      # check if the required `s3_multipart_upload_data` is null
      if (is.null(self$`s3_multipart_upload_data`)) {
        invalid_fields["s3_multipart_upload_data"] <- "Non-nullable required field `s3_multipart_upload_data` cannot be null."
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
# CustomerListUploadCreateResponse$unlock()
#
## Below is an example to define the print function
# CustomerListUploadCreateResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerListUploadCreateResponse$lock()

