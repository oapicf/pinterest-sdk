//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_status.g.dart';

class CatalogsStatus extends EnumClass {

  /// Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const CatalogsStatus ACTIVE = _$ACTIVE;
  /// Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
  @BuiltValueEnumConst(wireName: r'INACTIVE')
  static const CatalogsStatus INACTIVE = _$INACTIVE;

  static Serializer<CatalogsStatus> get serializer => _$catalogsStatusSerializer;

  const CatalogsStatus._(String name): super(name);

  static BuiltSet<CatalogsStatus> get values => _$values;
  static CatalogsStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CatalogsStatusMixin = Object with _$CatalogsStatusMixin;

