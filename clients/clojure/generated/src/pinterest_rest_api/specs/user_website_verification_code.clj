(ns pinterest-rest-api.specs.user-website-verification-code
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-website-verification-code-data
  {
   (ds/opt :verification_code) string?
   (ds/opt :dns_txt_record) string?
   (ds/opt :metatag) string?
   (ds/opt :filename) string?
   (ds/opt :file_content) string?
   })

(def user-website-verification-code-spec
  (ds/spec
    {:name ::user-website-verification-code
     :spec user-website-verification-code-data}))
