# @author: Jameel Hamid Khan

def find_num(input_list: list):
    temp_list = input_list

    # sort list sequentially
    temp_list.sort()

    for i in temp_list:
        total = temp_list[i] + 1
        if temp_list[i+1] == total:
            continue
        else:
            missing_num = total
            break

    return missing_num


def main():
    num_list = [1, 3, 4, 6, 8, 7, 5, 9]
    missing_number = find_num(num_list)
    print(missing_number)


if __name__ == "__main__":
    main()
