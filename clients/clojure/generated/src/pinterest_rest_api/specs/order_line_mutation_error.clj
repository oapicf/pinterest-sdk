(ns pinterest-rest-api.specs.order-line-mutation-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.order-line :refer :all]
            )
  (:import (java.io File)))


(def order-line-mutation-error-data
  {
   (ds/opt :data) order-line-spec
   (ds/opt :error_messages) (s/coll-of string?)
   })

(def order-line-mutation-error-spec
  (ds/spec
    {:name ::order-line-mutation-error
     :spec order-line-mutation-error-data}))
