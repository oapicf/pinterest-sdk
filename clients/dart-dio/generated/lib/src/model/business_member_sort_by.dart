//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_member_sort_by.g.dart';

class BusinessMemberSortBy extends EnumClass {

  /// The name of field that businesses are sorted by
  @BuiltValueEnumConst(wireName: r'FULL_NAME')
  static const BusinessMemberSortBy FULL_NAME = _$FULL_NAME;
  /// The name of field that businesses are sorted by
  @BuiltValueEnumConst(wireName: r'BUSINESS_ROLES')
  static const BusinessMemberSortBy BUSINESS_ROLES = _$BUSINESS_ROLES;
  /// The name of field that businesses are sorted by
  @BuiltValueEnumConst(wireName: r'CREATED_TIME')
  static const BusinessMemberSortBy CREATED_TIME = _$CREATED_TIME;

  static Serializer<BusinessMemberSortBy> get serializer => _$businessMemberSortBySerializer;

  const BusinessMemberSortBy._(String name): super(name);

  static BuiltSet<BusinessMemberSortBy> get values => _$values;
  static BusinessMemberSortBy valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BusinessMemberSortByMixin = Object with _$BusinessMemberSortByMixin;

