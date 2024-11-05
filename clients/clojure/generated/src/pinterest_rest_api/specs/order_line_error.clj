(ns pinterest-rest-api.specs.order-line-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def order-line-error-data
  {
   (ds/opt :data) order-line-spec
   (ds/opt :error_messages) (s/coll-of string?)
   })

(def order-line-error-spec
  (ds/spec
    {:name ::order-line-error
     :spec order-line-error-data}))
