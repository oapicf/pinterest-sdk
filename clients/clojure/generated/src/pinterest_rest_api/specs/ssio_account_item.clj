(ns pinterest-rest-api.specs.ssio-account-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ssio-account-address :refer :all]
            )
  (:import (java.io File)))


(def ssio-account-item-data
  {
   (ds/opt :id) string?
   (ds/opt :io_terms_id) string?
   (ds/opt :io_terms) string?
   (ds/opt :us_terms_id) string?
   (ds/opt :us_terms) string?
   (ds/opt :row_terms_id) string?
   (ds/opt :row_terms) string?
   (ds/opt :io_type) string?
   (ds/opt :addresses) (s/coll-of ssio-account-address-spec)
   })

(def ssio-account-item-spec
  (ds/spec
    {:name ::ssio-account-item
     :spec ssio-account-item-data}))
