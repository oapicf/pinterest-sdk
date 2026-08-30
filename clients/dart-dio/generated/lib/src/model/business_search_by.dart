//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_search_by.g.dart';

class BusinessSearchBy extends EnumClass {

  /// The names of fields that business accounts are searched by
  @BuiltValueEnumConst(wireName: r'FULL_NAME')
  static const BusinessSearchBy FULL_NAME = _$FULL_NAME;
  /// The names of fields that business accounts are searched by
  @BuiltValueEnumConst(wireName: r'USERNAME')
  static const BusinessSearchBy USERNAME = _$USERNAME;
  /// The names of fields that business accounts are searched by
  @BuiltValueEnumConst(wireName: r'BUSINESS_ID')
  static const BusinessSearchBy BUSINESS_ID = _$BUSINESS_ID;
  /// The names of fields that business accounts are searched by
  @BuiltValueEnumConst(wireName: r'EMAIL')
  static const BusinessSearchBy EMAIL = _$EMAIL;

  static Serializer<BusinessSearchBy> get serializer => _$businessSearchBySerializer;

  const BusinessSearchBy._(String name): super(name);

  static BuiltSet<BusinessSearchBy> get values => _$values;
  static BusinessSearchBy valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BusinessSearchByMixin = Object with _$BusinessSearchByMixin;

