#' Create a new ProductGroupPromotionCreateRequest
#'
#' @description
#' ProductGroupPromotionCreateRequest Class
#'
#' @docType class
#' @title ProductGroupPromotionCreateRequest
#' @description ProductGroupPromotionCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field ad_group_id ID of the Ad Group the Product Group Promotion belongs to. character
#' @field product_group_promotion  list(\link{ProductGroupPromotionCreateRequestElement})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProductGroupPromotionCreateRequest <- R6::R6Class(
  "ProductGroupPromotionCreateRequest",
  public = list(
    `ad_group_id` = NULL,
    `product_group_promotion` = NULL,

    #' @description
    #' Initialize a new ProductGroupPromotionCreateRequest class.
    #'
    #' @param ad_group_id ID of the Ad Group the Product Group Promotion belongs to.
    #' @param product_group_promotion product_group_promotion
    #' @param ... Other optional arguments.
    initialize = function(`ad_group_id`, `product_group_promotion`, ...) {
      if (!missing(`ad_group_id`)) {
        if (!(is.character(`ad_group_id`) && length(`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", `ad_group_id`))
        }
        self$`ad_group_id` <- `ad_group_id`
      }
      if (!missing(`product_group_promotion`)) {
        stopifnot(is.vector(`product_group_promotion`), length(`product_group_promotion`) != 0)
        sapply(`product_group_promotion`, function(x) stopifnot(R6::is.R6(x)))
        self$`product_group_promotion` <- `product_group_promotion`
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
    #' @return ProductGroupPromotionCreateRequest as a base R list.
    #' @examples
    #' # convert array of ProductGroupPromotionCreateRequest (x) to a data frame
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
    #' Convert ProductGroupPromotionCreateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProductGroupPromotionCreateRequestObject <- list()
      if (!is.null(self$`ad_group_id`)) {
        ProductGroupPromotionCreateRequestObject[["ad_group_id"]] <-
          self$`ad_group_id`
      }
      if (!is.null(self$`product_group_promotion`)) {
        ProductGroupPromotionCreateRequestObject[["product_group_promotion"]] <-
          lapply(self$`product_group_promotion`, function(x) x$toSimpleType())
      }
      return(ProductGroupPromotionCreateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupPromotionCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupPromotionCreateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_group_id`)) {
        self$`ad_group_id` <- this_object$`ad_group_id`
      }
      if (!is.null(this_object$`product_group_promotion`)) {
        self$`product_group_promotion` <- ApiClient$new()$deserializeObj(this_object$`product_group_promotion`, "array[ProductGroupPromotionCreateRequestElement]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProductGroupPromotionCreateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProductGroupPromotionCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProductGroupPromotionCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_group_id` <- this_object$`ad_group_id`
      self$`product_group_promotion` <- ApiClient$new()$deserializeObj(this_object$`product_group_promotion`, "array[ProductGroupPromotionCreateRequestElement]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProductGroupPromotionCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_group_id`
      if (!is.null(input_json$`ad_group_id`)) {
        if (!(is.character(input_json$`ad_group_id`) && length(input_json$`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", input_json$`ad_group_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductGroupPromotionCreateRequest: the required field `ad_group_id` is missing."))
      }
      # check the required field `product_group_promotion`
      if (!is.null(input_json$`product_group_promotion`)) {
        stopifnot(is.vector(input_json$`product_group_promotion`), length(input_json$`product_group_promotion`) != 0)
        tmp <- sapply(input_json$`product_group_promotion`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProductGroupPromotionCreateRequest: the required field `product_group_promotion` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProductGroupPromotionCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_group_id` is null
      if (is.null(self$`ad_group_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_group_id`, "^(AG)?\\d+$")) {
        return(FALSE)
      }

      # check if the required `product_group_promotion` is null
      if (is.null(self$`product_group_promotion`)) {
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
      # check if the required `ad_group_id` is null
      if (is.null(self$`ad_group_id`)) {
        invalid_fields["ad_group_id"] <- "Non-nullable required field `ad_group_id` cannot be null."
      }

      if (!str_detect(self$`ad_group_id`, "^(AG)?\\d+$")) {
        invalid_fields["ad_group_id"] <- "Invalid value for `ad_group_id`, must conform to the pattern ^(AG)?\\d+$."
      }

      # check if the required `product_group_promotion` is null
      if (is.null(self$`product_group_promotion`)) {
        invalid_fields["product_group_promotion"] <- "Non-nullable required field `product_group_promotion` cannot be null."
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
# ProductGroupPromotionCreateRequest$unlock()
#
## Below is an example to define the print function
# ProductGroupPromotionCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProductGroupPromotionCreateRequest$lock()

