package nextstep.step2.view;

import nextstep.step2.domain.Lotto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LottoTicketViewTest {
	@Test
	@DisplayName("로또 티켓을 출력한다.")
	public void lottoTicketPrintTest() {
		LottoTicketView ticket = new LottoTicketView();
		ticket.printLottoTickets(getMockLottos());
	}

	private List<Lotto> getMockLottos() {
		Lotto lotto1 = new Lotto(new HashSet<>(Arrays.asList(1,2,3,4,5,6)));
		Lotto lotto2 = new Lotto(new HashSet<>(Arrays.asList(7,8,9,10,11,12)));
		return Arrays.asList(lotto1,lotto2);
	}
}
