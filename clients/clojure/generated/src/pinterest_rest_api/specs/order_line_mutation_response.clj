(ns pinterest-rest-api.specs.order-line-mutation-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.order-line-mutation-result :refer :all]
            )
  (:import (java.io File)))


(def order-line-mutation-response-data
  {
   (ds/opt :data) order-line-mutation-result-spec
   })

(def order-line-mutation-response-spec
  (ds/spec
    {:name ::order-line-mutation-response
     :spec order-line-mutation-response-data}))
