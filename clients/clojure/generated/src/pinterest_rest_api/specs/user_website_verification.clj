(ns pinterest-rest-api.specs.user-website-verification
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-website-verification-data
  {
   (ds/opt :dns_txt_record) string?
   (ds/opt :file_content) string?
   (ds/opt :filename) string?
   (ds/opt :metatag) string?
   (ds/opt :verification_code) string?
   })

(def user-website-verification-spec
  (ds/spec
    {:name ::user-website-verification
     :spec user-website-verification-data}))
